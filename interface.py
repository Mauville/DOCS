import firebase_admin
from firebase_admin import credentials
import datetime
from google.cloud import firestore
import google.cloud.exceptions
from firebase_admin import firestore


def explicit():
    from google.cloud import storage

    # Explicitly use service account credentials by specifying the private key
    # file.
    storage_client = storage.Client.from_service_account_json(
        '/home/mudkip/Desktop/MTY/HackMTY-d1e79ec19780.json')
db = firestore.client()

data = {
    u'name': u'Los Angeles',
    u'state': u'CA',
    u'country': u'USA'
}

db.child("users")
##db.child(firebaseAuth.currentUser!!.uid)
