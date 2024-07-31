# Define the root directory for your projects (adjust the path as needed)
$rootDir = ""

# Define the list of services in the order they should be started
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

# Function to start a service
function Start-Service {
    param (
        [string]$serviceName
    )

    $serviceDir = Join-Path $rootDir $serviceName
    Write-Output "Starting $serviceName..."

    # Determine the appropriate Maven wrapper script
    if (Test-Path "$serviceDir/mvnw.cmd") {
        Start-Process -FilePath "$serviceDir/mvnw.cmd" -ArgumentList "spring-boot:run" -WorkingDirectory $serviceDir -NoNewWindow
    } elseif (Test-Path "$serviceDir/mvnw") {
        Start-Process -FilePath "$serviceDir/mvnw" -ArgumentList "spring-boot:run" -WorkingDirectory $serviceDir -NoNewWindow
    } else {
        Write-Output "Maven wrapper not found in $serviceDir"
    }
}

# Start each service in order with a delay
foreach ($service in $services) {
    Start-Service -serviceName $service
    Write-Output "Waiting 10 seconds before starting the next service..."
    Start-Sleep -Seconds 10
}
