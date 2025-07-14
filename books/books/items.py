# Define here the models for your scraped items
#
# See documentation in:
# https://docs.scrapy.org/en/latest/topics/items.html

import scrapy


class BooksItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    _id = scrapy.Field()
    url = scrapy.Field()
    title = scrapy.Field()
    price = scrapy.Field()
    pass


# # def process_item(self, item, spider):
#         item_id = self.compute_item_id(item)
#         item_dict = ItemAdapter(item).asdict()

#         self.db[self.COLLECTION_NAME].update_one(
#             filter={"_id": item_id},
#             update={"$set": item_dict},
#             upsert=True
#         )

#         return item
#  this is for when you do want items with same id's to be stored.