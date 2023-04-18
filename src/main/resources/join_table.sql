SELECT product_name
FROM netology.ORDERS o
         JOIN netology.CUSTOMERS c ON c.id = o.customer_id
WHERE UPPER(c.name) LIKE :name;