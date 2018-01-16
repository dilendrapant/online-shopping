CREATE TABLE categorY(

id IDENTITY,
name varchar(255),
description varchar(255),
image_url varchar(50),
is_active boolean,
CONSTRAINT pk_category_id PRIMARY KEY (id)


);