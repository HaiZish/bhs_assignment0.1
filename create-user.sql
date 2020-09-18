CREATE USER 'springemployee'@'localhost' IDENTIFIED BY 'springemployee';

GRANT ALL PRIVILEGES ON * . * TO 'springemployee'@'localhost';

#
# Starting with MySQL 8.0.4, the MySQL team changed the 
# default authentication plugin for MySQL server 
# from mysql_native_password to caching_sha2_password.
#
# The command below will make the appropriate updates for your user account.
#
# See the MySQL Reference Manual for details: 
# https://dev.mysql.com/doc/refman/8.0/en/caching-sha2-pluggable-authentication.html
#
ALTER USER 'springemployee'@'localhost' IDENTIFIED WITH mysql_native_password BY 'springemployee';