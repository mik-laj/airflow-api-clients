# coding: utf-8

from __future__ import absolute_import
from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from app.openapi_server.models.base_model_ import Model
from openapi_server import util


class ConnectionAllOf(Model):
    """NOTE: This class is auto generated by the swagger code generator program.

    Do not edit the class manually.
    """

    def __init__(self, password: str=None, extra: str=None):  # noqa: E501
        """ConnectionAllOf - a model defined in Swagger

        :param password: The password of this ConnectionAllOf.  # noqa: E501
        :type password: str
        :param extra: The extra of this ConnectionAllOf.  # noqa: E501
        :type extra: str
        """
        self.swagger_types = {
            'password': str,
            'extra': str
        }

        self.attribute_map = {
            'password': 'password',
            'extra': 'extra'
        }

        self._password = password
        self._extra = extra

    @classmethod
    def from_dict(cls, dikt) -> 'ConnectionAllOf':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Connection_allOf of this ConnectionAllOf.  # noqa: E501
        :rtype: ConnectionAllOf
        """
        return util.deserialize_model(dikt, cls)

    @property
    def password(self) -> str:
        """Gets the password of this ConnectionAllOf.


        :return: The password of this ConnectionAllOf.
        :rtype: str
        """
        return self._password

    @password.setter
    def password(self, password: str):
        """Sets the password of this ConnectionAllOf.


        :param password: The password of this ConnectionAllOf.
        :type password: str
        """

        self._password = password

    @property
    def extra(self) -> str:
        """Gets the extra of this ConnectionAllOf.


        :return: The extra of this ConnectionAllOf.
        :rtype: str
        """
        return self._extra

    @extra.setter
    def extra(self, extra: str):
        """Sets the extra of this ConnectionAllOf.


        :param extra: The extra of this ConnectionAllOf.
        :type extra: str
        """

        self._extra = extra
