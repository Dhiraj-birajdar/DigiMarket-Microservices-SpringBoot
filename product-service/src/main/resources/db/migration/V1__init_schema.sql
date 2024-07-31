create table category (
        id integer not null auto_increment,
        description varchar(255),
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

#     create table category_seq (
#         next_val bigint
#     ) engine=InnoDB;
#
#     insert into category_seq values ( 1 );

    create table product (
        available_quantity float(53) not null,
        category_id integer,
        id integer not null auto_increment,
        price decimal(38,2),
        description varchar(255),
        name varchar(255),
        primary key (id)
    ) engine=InnoDB;

#     create table product_seq (
#         next_val bigint
#     ) engine=InnoDB;
#
#     insert into product_seq values ( 1 );

    alter table product
       add constraint FK1mtsbur82frn64de7balymq9s
       foreign key (category_id)
       references category (id);
# create table if not exists category
# (
#     id          integer not null
#         primary key,
#     description varchar(255),
#     name        varchar(255)
# );
#
# create table if not exists product
# (
#     id                 integer          not null
#         primary key,
#     available_quantity double precision not null,
#     description        varchar(255),
#     name               varchar(255),
#     price              numeric(38, 2),
#     category_id        integer
#         constraint fk1mtsbur82frn64de7balymq9s
#             references category
# );
#
# create sequence if not exists category_seq increment by 50;
# create sequence if not exists product_seq increment by 50;
#


