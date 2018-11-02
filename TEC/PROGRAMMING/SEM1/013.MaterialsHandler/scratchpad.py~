import firebase_admin
from firebase_admin import credentials
from firebase_admin import firestore
from time import sleep

# Use the application default credentials
cred = credentials.Certificate("key.json")
project_id = "materiales-7f32d"
firebase_admin.initialize_app(cred, {
  'projectId': project_id,
})

db = firestore.client()
docs = db.collection(u'MATS').get()
matlist = []
for doc in docs:
    for doc in docs:
       matlist.append(doc.id)
print(matlist)
