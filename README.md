# EngineStorage
An API made to storage data into Json files.

# How to use

```
You can use it Easily, almost with no performance issues, you can also Multi-thread it, if needed.

// writing 
File file = new File(...);

// writing and transforming to object
String text = gson.toJson(yourobject);
EngineStorage.write(file,text);

// reading and getting object from string, using gson
String encode = EngineStorage.read(file);
Object ob = gson.fromJson(encode,Object.class);

//

```

# If trying to read massive amount of files, this is the best way of doing it!

```
//If able to use java 7:
Path path = FileSystems.getDefault().getPath(getDataFolder().getAbsolutePath() + "/playerdata");

                    Files.walkFileTree(path, new FileVisitor<Path>() {
                        @Override
                        public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) {
                            return FileVisitResult.CONTINUE;
                        }
                        @Override
                        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                            // run whats necessary here.
                            return FileVisitResult.CONTINUE;
                        }
                        @Override
                        public FileVisitResult visitFileFailed(Path file, IOException exc) {
                            return FileVisitResult.TERMINATE;
                        }
                        @Override
                        public FileVisitResult postVisitDirectory(Path dir, IOException exc) {
                            return FileVisitResult.CONTINUE;
                        }
                    });
                } catch (IOException e) {
                    e.printStackTrace();
                }
```

# Final comments 

I've made some benchmarks, if you wanna add data into a hash etc from the file, it can run 2.000.000 files in 76ms, if you do have an best way please feel free to contat me, i'd love to hear from you.
Contact data:
pedro.paulo.pagani@gmail.com
WhatsApp: +55 61 998530494
Discord: Pedro Pagani#9675
Twitter: @PedroMPagani
