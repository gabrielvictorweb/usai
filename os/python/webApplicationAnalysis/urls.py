from .views import WebApplicationAnalysis
from django.urls import path

urlpatterns = [
    path("", WebApplicationAnalysis.as_view()),
]
