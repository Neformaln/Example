/**
 * Created by mchukd@gmail.com on 3/12/16.
 */
var brandOptions = {
    valueNames: ['brand-name', 'founded-year', 'headquarter']
};

var brandList = new List('car-brands', brandOptions);

var modelOptions = {
    valueNames: ['brand-name', 'model-name', 'generation', 'production-year',
                 'doors', 'seats','maximum-speed']
};

var modelList = new List('car-models', modelOptions);