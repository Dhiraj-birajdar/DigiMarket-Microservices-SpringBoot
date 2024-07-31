# Define the root directory for your projects (adjust the path as needed)
$rootDir = ""

# Define the list of services (directory names)
$services = @(
    "configuration-server",
    "discovery-server",
    "api-gateway",
    "customer-service",
    "order-service",
    "payment-service",
    "product-service",
    "notification-service"
)

# Function to stop a service
function Stop-Service {
    param (
        [string]$serviceName
    )

    $serviceDir = Join-Path $rootDir $serviceName
    Write-Output "Stopping $serviceName..."

    # Get all Java processes
    $javaProcesses = Get-Process java -ErrorAction SilentlyContinue

    if ($null -ne $javaProcesses) {
        foreach ($process in $javaProcesses) {
            try {
                $cmdLine = (Get-CimInstance Win32_Process -Filter "ProcessId=$($process.Id)").CommandLine
                if ($cmdLine -like "*$serviceDir*") {
                    Write-Output "Stopping process $($process.Id) for $serviceName..."
                    Stop-Process -Id $process.Id -Force
                }
            } catch {
                Write-Output "Error stopping process $($process.Id) for $serviceName: $_"
            }
        }
    } else {
        Write-Output "No running Java processes found for $serviceName."
    }
}

# Stop each service
foreach ($service in $services) {
    Stop-Service -serviceName $service
    Write-Output "Waiting 5 seconds before stopping the next service..."
    Start-Sleep -Seconds 5
}
