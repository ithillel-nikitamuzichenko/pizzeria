package ua.opu.dl.pizzeria.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ua.opu.dl.pizzeria.model.Ingredient;
import ua.opu.dl.pizzeria.model.Pizza;
import ua.opu.dl.pizzeria.service.PizzaService;

@Controller
public class BaseController {

    @Autowired
    private PizzaService pizzaService;

    /**
     * Test controller, load data from DAO and count
     * total order price
     * @param model
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome(ModelMap model) {

        Pizza pizza = pizzaService.loadById(10);

        Double totalPrice = pizza.getPrice();
        for (Ingredient ingredient : pizza.getMap().keySet()) {
            totalPrice += ingredient.getPrice();
        }

        model.addAttribute("pizza", pizza);
        model.addAttribute("totalPrice", totalPrice);

        return "index";
    }

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String about() {

        return "about";
    }
}
