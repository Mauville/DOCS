import firebase_admin
from firebase_admin import credentials
from firebase_admin import firestore

# TODO use a function to check if returning or loaning can be done
# These are the functions that interact with Firebase

# Sign in into Firebase with credentials provided in key.json
# Keys.json is a service account key generated on the console
def getdb():
    cred = credentials.Certificate("key.json")
    project_id = "materiales-7f32d"
    firebase_admin.initialize_app(cred, {
      'projectId': project_id,
    })

    db = firestore.client()
    return db

# Modify availability
def modAvail(material, modifier):
    fbdb = getdb()
    material_ref = fbdb.collection(u'MATS').document(material)
    docs = material_ref.get()
    checkavai = docs.to_dict()
    avai = checkavai.get("Availability")
    avai += modifier
    material_ref.update({'Availability': avai})

#Append student to loaners list
def loaner(name, ID, material):
    fbdb = getdb()
    material_ref = fbdb.collection(u'MATS').document(material)
    docs = material_ref.get()
    dbdict = docs.to_dict()
    entry = 'LoanedTo.' + ID
    material_ref.update({entry : name})

# Remove student from loaners list
def returner(name, ID, material):
    fbdb = getdb()
    material_ref = fbdb.collection(u'MATS').document(material)
    docs = material_ref.get()
    dbdict = docs.to_dict()
    entry = 'LoanedTo.' + ID
    material_ref.update({entry : firestore.DELETE_FIELD})

# Maintenance Function. Get element list from db
def elementlist():
    fbdb = getdb()
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
#APPLE WATCH
#APPLETV
#DJI PHANTOM QUADCOPTER
#DOUBLE 2
#DUALSHOCK 4
#ECHO
#FITBIT
#GALAXY S7
#GEAR VR
#HDMI CABLE
#IPHONE SE
#KINECT
#LEAP MOTION
#LED CUBE
#LG TV 32"
#MICRO SD 32GB
#MYO
#OCULUS
#PANONO
#RASPBERRY PI 3
#RASPBERRY PI 3 CASE
#RASPBERRY PI CHARGER
#SAMSUNG 360
#SAMSUNG S2
#SPHERO
#SPHERO PARK
#SPHERO RAMPS
#STANDS
#
