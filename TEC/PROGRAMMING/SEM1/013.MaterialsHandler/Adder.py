import firebase_admin
from firebase_admin import credentials
from firebase_admin import firestore

# Use the application default credentials
cred = credentials.Certificate('key.json')
project_id = "materiales-7f32d"
firebase_admin.initialize_app(cred, {
  'projectId': project_id,
})

db = firestore.client()
while True:
    matname = input("Material name \n")
    matavai = int (input("Availability \n"))
    doc_ref = db.collection(u'MATS').document(matname)
    doc_ref.set({
        u'Availability': matavai,
        u'LoanedTo': []
        })
