INSERT INTO customers(first_name, last_name) VALUES('Nobita', 'Nobi');
INSERT INTO customers(first_name, last_name) VALUES('Takeshi', 'Goda');
INSERT INTO customers(first_name, last_name) VALUES('Suneo', 'Honekawa');
INSERT INTO customers(first_name, last_name) VALUES('Shizuka', 'Minamoto');

create table ProductItems (
    id INT PRIMARY KEY AUTO_INCREMENT,
    itemName varchar(128),
    imgPath varchar(256)
);
INSERT INTO ProductItems(itemName, imgPath) VALUES('スニーカー白', 'D:\Prg_Work\AI_Codinator\src\main\resources\templates\shop\1.jpg');

/*
create table IF NOT EXISTS TestTbl (
    id INT PRIMARY KEY AUTO_INCREMENT,
    itemName varchar(128)
    filedata varbinary
);

INSERT INTO TestTbl(itemName, filedata) VALUES('サンプル',select BulkColumn
FROM OPENROWSET(BULK N'd:\img\1.jpg', SINGLE_BLOB));

*/
