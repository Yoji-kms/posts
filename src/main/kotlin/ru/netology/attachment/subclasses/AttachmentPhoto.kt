package ru.netology.attachment.subclasses

import ru.netology.attachment.Attachment
import ru.netology.attachment.AttachmentType
import ru.netology.attachment.types.Photo

data class AttachmentPhoto(val photo: Photo) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.PHOTO
}