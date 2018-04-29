INSERT INTO customers(first_name, last_name, pass_word) VALUES('Nobita', 'Nobi', '1111');
INSERT INTO customers(first_name, last_name, pass_word) VALUES('Takeshi', 'Goda', '1111');
INSERT INTO customers(first_name, last_name, pass_word) VALUES('Suneo', 'Honekawa', '1111');
INSERT INTO customers(first_name, last_name, pass_word) VALUES('Shizuka', 'Minamoto', '1111');

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
