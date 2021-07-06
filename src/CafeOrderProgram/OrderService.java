package CafeOrderProgram;

public interface OrderService {
	public void setOrderAmericano(MenuVO menu);
	public void setOrderVanillaLatte(MenuVO menu);
	public void setOrderLemonAde(MenuVO menu);
	public void setOrderGrapeFruitAde(MenuVO menu);
	public void setOrderWaterMelonJuice(MenuVO menu);
	public void setOrderTomatoJuice(MenuVO menu);
	public void setOption(MenuVO menu);
	public void getOrder();
	
}