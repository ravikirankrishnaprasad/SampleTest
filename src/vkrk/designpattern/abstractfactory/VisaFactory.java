package com.vkrk.designpattern.abstractfactory;

public class VisaFactory extends CreditCardFactory {
	public CreditCard getCreditCard(CardType cardType){
		switch(cardType) {
			case GOLD:
				return new VisaGoldCreditCard();
				
			case PLATINUM:
				return new VisaBlackCreditCard();
		}
		return null;
	}

	@Override
	public Validator getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
