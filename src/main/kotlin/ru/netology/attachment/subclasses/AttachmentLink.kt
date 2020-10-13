package ru.netology.attachment.subclasses

import ru.netology.attachment.Attachment
import ru.netology.attachment.AttachmentType
import ru.netology.attachment.types.Link

data class AttachmentLink(val link: Link) : Attachment {
    override val type: AttachmentType
        get() = AttachmentType.LINK
}