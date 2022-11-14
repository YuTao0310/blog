#!/bin/bash
list_table=$(mysql -uroot -proot -Nse "select table_name from information_schema.TABLES where TABLE_SCHEMA='sg_blog'")

for table in $list_table
do
    mysql -uroot -proot -e "rename table sg_blog.$table to ty_blog.$table"
done
