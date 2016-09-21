package com.vkrk.designpattern.abstractfactory;

public class AmexFactory extends CreditCardFactory {

	@Override
	public CreditCard getCreditCard(CardType cardType) {
		switch (cardType){
		case GOLD:
			return new AmexGoldCreditCard();
			
		case PLATINUM:
			return new AmexPlatinumCreditCard();
		}
		return null;
	}

	public Validator getValidator(CardType cardType) {
		// TODO Auto-generated method stub
		return null;
	}

}
