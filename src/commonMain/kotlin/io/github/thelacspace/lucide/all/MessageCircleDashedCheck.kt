package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MessageCircleDashedCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f, 2.182f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f, 21.818f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.609f, 3.72f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.182f, 13.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.28f, 17.61f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.818f, 10.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.721f, 6.391f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(6.163f, 21.117f)
                lineToRelative(-2.906f, .85f)
                arcToRelative(1f, 1f, 0f, true, false, -1.169f, lf)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 9f)
                lineToRelative(-5.5f, 5.5f)
                lineTo(8f, 12f)
            }
}

public val LucideIcons.All.MessageCircleDashedCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MessageCircleDashedCheck: ImageVector
    @Composable get() = MessageCircleDashedCheckDefinition.asImageVector()
