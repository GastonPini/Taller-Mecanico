# Taller Mecánico

taller-mecanico es una aplicación para administrar un taller mecámico. Esto incluye el login a la aplicación para un usuario de administración y un usuario mecánico:  
* El usuario de administración puede realizar el alta/baja/modificaciones de: Marcas, Modelos, Vehículos y Mantenimiento.  
* The usuario mecánico puede realizar el alta/baja/modificaciones de Mantenimiento.  

### Proyecto: TallerM
### Backup de base de datos: TallerMBackup
### Nombre de la base de datos: Taller

#### Contraseña: lalala123

-------------------------------------------------------------------------------------

Base de datos creada mediante las sentencias provistas por la cátedra* en la semana 10: script-tallermecanico.sql
(https://campus.frcu.utn.edu.ar/virtual/pluginfile.php/37183/mod_resource/content/1/script-tallermecanico.sql).

-------------------------------------------------------------------------------------

Personas y usuarios de ejemplos, también disponibles en el archivo script-insert.txt.

-------------------------------------------------------------------------------------

Proyecto TallerM probado en:  
* Ubuntu 20.04, NetBeans 8.2 - pgAdmin4.  
* Windows 7 Ultimate, NetBeans 11.1 - pgAdmin4.  
* Windows 7 Ultimate, NetBeans 11.3 - pgAdmin4.  
(el renderizado puede variar según el SO)  

#### Algunos detalles de implementación:

* Debido a contratiempos, la clase "Mantenimiento" no llegó a ser implementada.  

* Se editó el formato de "fecha" en la tabla "mantenimientos", de "date" a "character varying" (String).  

* En la tabla "vehículos", se almacenaron a los dueños en la columna "descripcion".  
