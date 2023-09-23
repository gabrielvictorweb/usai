from rest_framework import serializers


class WebApplicationAnalysisSerializer(serializers.Serializer):
    target = serializers.CharField()
    status = serializers.BooleanField()
    time = serializers.DecimalField(max_digits=5, decimal_places=2)
