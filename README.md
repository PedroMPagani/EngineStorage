# EngineStorage
An API made to storage data into Json files.

# How to use

```
You can use it Easily, almost with no performance issues, you can also Multi-thread it, if needed.

// writing 
File file = new File(...);

// writing and transforming to object
String text = gson.toJson(yourobject);
EngineStorageAPI.write(file,text);

// reading and getting object from string, using gson
String encode = EngineStorageAPI.read(file);
Object ob = gson.fromJson(encode,Object.class);

//

```
