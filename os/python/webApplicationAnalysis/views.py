from rest_framework import status
from rest_framework.response import Response
from rest_framework.views import APIView
from rest_framework import status
from .serializes import WebApplicationAnalysisSerializer


class WebApplicationAnalysis(APIView):
    def get(self, request):
        books_data = {"target": "Book 1", "status": True, "time": 9.99}

        serializer = WebApplicationAnalysisSerializer(data=books_data)
        serializer.is_valid(raise_exception=True)

        response_data = serializer.data

        return Response(response_data, status=status.HTTP_200_OK)
