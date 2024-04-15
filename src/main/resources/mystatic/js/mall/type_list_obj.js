/**
 * Created by comp208 on 2024/3/1.
 */
var apple = createObject(1, 'apple');
var samsung = createObject(2, 'Samsung');

var huawei = createObject(4, 'Huawei');
var others = createObject(8, 'Others');

var mobilePhone = new Object();
mobilePhone.name = 'Mobile Phone';
mobilePhone.content = [apple, samsung, huawei,others];

var slr = createObject(11, 'SLR');
var othersC = createObject(12, 'Others');
var content = [slr, othersC];
var camera = createType('Camera', content);
var laptop = createObject(13, 'Laptop');
var tablet = createObject(14, 'Tablet');
var desktop = createObject(15, 'Desktop');
var monitor = createObject(16, 'Monitor');
var mouse = createObject(17, 'Mouse');
var hardDisk = createObject(18, 'Hard Disk');
var usbDrive = createObject(19, 'USB Drive');
var portableHardDrive = createObject(20, 'Portable Hard Drive');
var othersD = createObject(21, 'Others');
var content1 = [laptop, tablet, desktop, monitor, mouse,
    hardDisk, usbDrive, portableHardDrive, othersD];
var computer = createType('Computer', content1);
var washingMachine = createObject(22, 'Washing Machine');
var waterDispenser = createObject(23, 'Water Dispenser');
var hairDryer = createObject(24, 'Hair Dryer');
var electricShaver = createObject(25, 'Electric Shaver');
var fan = createObject(26, 'Fan');
var eggBoiler = createObject(27, 'Egg Boiler');
var inductionCooker = createObject(28, 'Induction Cooker');
var riceCooker = createObject(29, 'Rice Cooker');
var othersE = createObject(30, 'Others');
var content2 = [washingMachine, waterDispenser, hairDryer, electricShaver,
    fan, eggBoiler, inductionCooker, riceCooker, othersE];
var appliances = createType('Appliances', content2);



var subwoofer = createObject(34, 'Subwoofer');
var microphone = createObject(35, 'Microphone');
var content3 = [ subwoofer, microphone];
var multimedia = createType('Multimedia', content3);
var top = createObject(36, 'Top');
var pants = createObject(37, 'Pants');
var skirt = createObject(38, 'Skirt');
var othersF = createObject(39, 'Others');
var content4 = [top, pants, skirt, othersF];
var womenClothing = createType('Women Clothing', content4);
var topM = createObject(40, 'Top');
var pantsM = createObject(41, 'Pants');
var othersM = createObject(42, 'Others');
var content5 = [topM, pantsM, othersM];
var menClothing = createType('Men Clothing', content5);
var sportsShoes = createObject(43, 'Sports Shoes');
var leatherShoes = createObject(44, 'Leather Shoes');
var canvasShoes = createObject(45, 'Canvas Shoes');
var sneakers = createObject(46, 'Sneakers');
var flatShoes = createObject(47, 'Flat Shoes');
var othersS = createObject(48, 'Others');
var content6 = [sportsShoes, leatherShoes, canvasShoes, sneakers, flatShoes, othersS];
var womenShoes = createType('Women Shoes', content6);
var sportsShoesM = createObject(49, 'Sports Shoes');
var leatherShoesM = createObject(50, 'Leather Shoes');
var canvasShoesM = createObject(51, 'Canvas Shoes');
var sneakersM = createObject(52, 'Sneakers');
var flatShoesM = createObject(53, 'Flat Shoes');
var othersSM = createObject(54, 'Others');
var content7 = [sportsShoesM, leatherShoesM, canvasShoesM, sneakersM, flatShoesM, othersSM];
var menShoes = createType('Men Shoes', content7);
var backpack = createObject(55, 'Backpack');
var suitcase = createObject(56, 'Suitcase');
var othersB = createObject(57, 'Others');
var content8 = [backpack, suitcase, othersB];
var bags = createType('Bags', content8);
var mechanicalWatch = createObject(58, 'Mechanical Watch');
var quartzWatch = createObject(59, 'Quartz Watch');
var digitalWatch = createObject(60, 'Digital Watch');
var othersW = createObject(61, 'Others');
var content9 = [mechanicalWatch, quartzWatch, digitalWatch, othersW];
var wristWatch = createType('Wrist Watch', content9);
var football = createObject(62, 'Football');
var badmintonRacket = createObject(63, 'Badminton Racket');
var tennisRacket = createObject(64, 'Tennis Racket');
var basketball = createObject(65, 'Basketball');
var rollerSkates = createObject(66, 'Roller Skates');
var tableTennisRacket = createObject(67, 'Table Tennis Racket');
var skateboard = createObject(68, 'Skateboard');
var othersQ = createObject(69, 'Others');
var content10 = [football, badmintonRacket, tennisRacket, basketball, rollerSkates, tableTennisRacket, skateboard, othersQ];
var equipment = createType('Equipment', content10);
var bicycle = createObject(70, 'Bicycle');
var electricVehicle = createObject(71, 'Electric Vehicle');
var othersT = createObject(72, 'Others');
var content11 = [bicycle, electricVehicle, othersT];
var commute = createType('Commute', content11);
var literature = createObject(73, 'Literature');
var comic = createObject(74, 'Comic');
var novel = createObject(75, 'Novel');
var othersX = createObject(76, 'Others');
var content12 = [literature, comic, novel, othersX];
var cultivation = createType('Cultivation', content12);






var politics = createObject(83, 'Politics');
var history = createObject(84, 'History');




var art = createObject(89, 'Art');
var othersZ = createObject(90, 'Others');
var content13 = [ politics, history,
      art, othersZ];
var major = createType('Major', content13);
var pen = createObject(91,'Pen');
var othersWJ = createObject(92, 'Others');
var content14 = [pen, othersWJ];

var stationery = createType('Stationery', content14);
var othersOthers = createObject(94, 'Others');
var content15 = [othersOthers];
var others = createType('Others', content15);
var type_list = [[mobilePhone, camera, computer], [appliances, multimedia],
    [womenClothing, menClothing, womenShoes, menShoes, bags, wristWatch], [equipment, commute]
    , [cultivation, major, stationery], [others]];

function createObject(id, name) {
    var temp = new Object();
    temp.id = id;
    temp.name = name;
    return temp;
}
function createType(name, content) {
    var temp = new Object();
    temp.name = name;
    temp.content = content;
    return temp;
}
function getTypeList() {
    return type_list;
}
