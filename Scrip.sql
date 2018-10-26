create DATABASE PastelesIsaac DEFAULT CHARACTER SET utf8 ;

use PastelesIsaac;


create table Usuario(
id_usuario  integer not null auto_increment,
nombre varchar(25) not null,
contraseña varchar(30),
PRIMARY KEY (id_usuario)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

create table Pasteles(
id_pastel integer not null auto_increment,
nombre varchar(40) not null,
descripcion varchar(250),
precio double,
costo double,
PRIMARY KEY (id_pastel)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


create table Ventas(
id_venta integer not null auto_increment,
Fecha datetime default NOW(),
id_usuario integer not null,
PRIMARY KEY (id_venta)
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


create table VentasPasteles(
id_venta integer not null,
id_pastel integer not null
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;