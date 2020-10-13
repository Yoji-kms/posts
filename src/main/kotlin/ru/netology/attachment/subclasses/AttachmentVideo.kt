package ru.netology.attachment.subclasses

import ru.netology.attachment.Attachment
import ru.netology.attachment.AttachmentType
import ru.netology.attachment.types.Video

data class AttachmentVideo(val video: Video) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.VIDEO
}