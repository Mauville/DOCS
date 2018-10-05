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

#Modify availability
def modAvail(fbdb, material, modifier):
    material_ref = fbdb.collection(u'MATS').document(material)
    docs = material_ref.get()
    checkavai = docs.to_dict()
    avai = checkavai.get("Availability")
    avai += modifier
    material_ref.update({'Availability': avai})

#Append to loaned
def loaner(fbdb, material, ID, name):
    material_ref = fbdb.collection(u'MATS').document(material)
    docs = material_ref.get()
    dbdict = docs.to_dict()
    entry = 'LoanedTo.' + ID
    material_ref.update({entry : name})

def returner(fbdb, material, ID, name):
    material_ref = fbdb.collection(u'MATS').document(material)
    docs = material_ref.get()
    dbdict = docs.to_dict()
    entry = 'LoanedTo.' + ID
    material_ref.update({entry : firestore.DELETE_FIELD})

def elementlist(fbdb):
    docs = fbdb.collection(u'MATS').get()
    matlist = []
    for doc in docs:
       matlist.append(doc.id)
    return matlist

#demoer
#ECHO = 'ECHO'
#A019292 = 'A019292'
#
#modAvail(db, ECHO, -1)
#loaner(db, ECHO, A019292, "MIKE")
#sleep(5)
#returner(db, ECHO, A019292, "MIKE")
#modAvail(db, ECHO, 1)