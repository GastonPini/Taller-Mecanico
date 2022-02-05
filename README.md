# Taller Mecanico

taller-mecanico is an application for managing a mechanical workshop. This ensures login access to the application for an administration user and a mechanical user.
The Administration user can register/deregister/modify: Brands, Models, Vehicles and Maintenance services.  
The mechanic user can register/deregister/modify Maintenance services.  

### Project: TallerM
### Database backup: TallerMBackup
### Database Name: Taller

#### Password: lalala123

-------------------------------------------------- -----------------------------------

Database created using the statements provided by the chair* in week 10: script-tallermecanico.sql
(https://campus.frcu.utn.edu.ar/virtual/pluginfile.php/37183/mod_resource/content/1/script-tallermecanico.sql).

-------------------------------------------------- -----------------------------------

Example people and users, also available in the script-insert.txt file.

-------------------------------------------------- -----------------------------------

TallerM project tested in:
- Ubuntu 20.04, NetBeans 8.2 - pgAdmin4.  
- Windows 7 Ultimate, NetBeans 11.1 - pgAdmin4.  
- Windows 7 Ultimate, NetBeans 11.3 - pgAdmin4.  
(rendering may vary depending on the OS)

#### Some details:

* Due to setbacks, "Mantenimiento" class cloud not be fully implemented.

* "date" format edited in the "maintenance" table, from "date" to "character varying" (String).

* In "vehicles" table, the owners were stored in the "description" column.
