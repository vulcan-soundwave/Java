CREATE TABLE t_message ( 
    id INT NOT NULL AUTO_INCREMENT PRIMARY KEY, 
    name CHAR(20) NOT NULL, 
    email CHAR(40), 
    msg TEXT NOT NULL 
) CHARSET=UTF8;
