-- 코드를 입력하세요
SELECT b.AUTHOR_ID, a.AUTHOR_NAME, b.CATEGORY, SUM(b.PRICE * s.SALES) AS TOTAL_SALES
FROM BOOK b
JOIN AUTHOR a
ON a.AUTHOR_ID = b.AUTHOR_ID
JOIN BOOK_SALES s
ON s.BOOK_ID = b.BOOK_ID
WHERE DATE_FORMAT(s.SALES_DATE,'%Y-%m') = '2022-01'
GROUP BY b.AUTHOR_ID, b.CATEGORY
ORDER BY AUTHOR_ID, CATEGORY DESC;