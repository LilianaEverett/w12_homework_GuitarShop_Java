# Weekend Homework - Guitars Shop "Strings and Things"

I was asked to model a music shop and I decided to model a Guitars Shop. This shop will contain items which can be sold. Each item can be played (string) and will have both a price at which the shop bought the item, and a price at which the item will be sold.

## Brief:

1. Create a IPlay interface that could be applied to guitars. This should have a play method that returns the sound of the instrument being played as a String.

2. Create classes for different types of guitars (e.g. acoustic guitar, electric guitar, etc). Each class will have its own instance variables for attributes particular to that guitar.

3. Create a Guitar superclass which contains attributes you see as being common to all instruments. The classes created in step 2 above can then inherit from this class.

4. Create a ISell interface which has a calculateMarkup method, which returns an int/double, based on the buying price and the selling price.

5. Create classes for items the shop may sell, i.e. which implement the ISell interface. Such items should have the following:
  - a type/description of the different items to sell.
  - a price at which the shop bought the item.
  - a price at which the shop plans to sell the item.

  Some ISell items will be musical instruments i.e. instruments can be both IPlay and ISell.

6. Create a Shop class, which has a collection of ISell items, called stock. The shop should be able to:
  -  add items to stock.
  -  remove items from stock.

# Possible Extensions

1. Using the calculateMarkup method for each item in stock, create a method which gives the total potential profit for the shop.
2. Create and use an enum for instrument types e.g. acoustic guitar, bass guitar, etc.
3. Any other extensions you may wish to add.
