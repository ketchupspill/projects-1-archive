python -m pip install scrapy #install



#default > div > div > div > div > section > div:nth-child(2) > ol > li:nth-child(1) > article > div.image_container > a > img
/html/body/div/div/div/div/section/div[2]/ol/li[1]/article/div[1]/a/img
//*[@id="default"]/div/div/div/div/section/div[2]/ol/li[1]/article/div[1]/a/img

#default > div > div > div > div > section > div:nth-child(2) > ol > li:nth-child(1) > article > h3 > a

from parsel import Selector

html = "<html><body><h1>Hello, world!</h1></body></html>"
selector = Selector(text=html)
text = selector.xpath("//h1/text()").get()
text

all_book_elements = response.css("article.product_pod")

for book in all_book_elements:
 print(book.css("h3 > a::attr(title)").get())

 for book in all_book_elements:
...     print(book.css("h3 > a::attr(href)").get())
...

>>> for book in all_book_elements:
...     print(book.css(".price_color::text").get())
...

Book elements	article.product_pod

URL	h3 > a::attr(href)

Title	h3 > a::attr(title)

Price	.price_color::text

h3 and a	Targets elements of that HTML element type

>	Indicates a child element

.price_color and article.product_pod	Indicates a class name and, optionally, specifies on which element the class name should be

::text	Targets the text content of a HTML tag

::attr(href)	Targets the value of an HTML attribute, in this case the URL in an href attribute

scrapy crawl book #this is the command to run your spider (scrapy is the lib, crawl is use spider command, book is the object to crawl. book contains link to target website so spider crawls url linked to 
book.)