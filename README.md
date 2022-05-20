This Proof Of Concept demonstrates having two custome applications:

- writer: writes to /my-files/data.txt (curl GET http://localhost:30001/write/{text-to-write})
- reader: reads from /my-files/data.txt (curl GET http://localhost:30002/read)

# deployment.yaml

The deployment deploys the following:

1. StorageClass: Template FileSystem for the provisioning of PersistentVolume.
2. PersistentVolumeClaim: The claim to be used by both applications in order for the file system to be shared.
3. writer: The writer application that uses the PersistentVolumeClaim.
4. reader: The reader application that uses the PersistentVolumeClaim.
5. writer-entrypoint: entrypoint Service to expose the writer application.
5. reader-entrypoint: entrypoint Service to expose the reader application.