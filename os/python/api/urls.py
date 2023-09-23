from django.urls import path, include

urlpatterns = [
    path("web-application-analysis/", include("webApplicationAnalysis.urls")),
]
