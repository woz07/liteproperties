# liteproperty
A light weight property management system

Though (liteconfig)[https://github.com/woz07/liteconfig] and liteproperties might seem similar, I assure you they aren't.
(liteconfig)[https://github.com/woz07/liteconfig] has a configuration system that runs globally, so if you were to close 
out your program and rerun it, the data you get from (https://github.com/woz07/liteconfig)[liteconfig] would stay the same, as 
the data is retrieved from a file, but if you were to delete the file or even clear the file then your data would disappear. Liteproperties 
on the other hand runs locally, so if you were to close your app then you would lose all that data you've created until you rerun it and 
run code that adds that same code back in.
