package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CircleDashedCheck") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.1f, 2.182f)
            }
            lucidePath(strokeWidth) {
                moveTo(13.9f, 21.818f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(16f, 9f)
                lineToRelative(-5.5f, 5.5f)
                lineTo(8f, 12f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.609f, 3.721f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.182f, 13.9f)
            }
            lucidePath(strokeWidth) {
                moveTo(20.279f, 17.609f)
            }
            lucidePath(strokeWidth) {
                moveTo(21.818f, 10.1f)
            }
            lucidePath(strokeWidth) {
                moveTo(3.721f, 6.391f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.391f, 20.279f)
            }
}

public val LucideIcons.All.CircleDashedCheckDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CircleDashedCheck: ImageVector
    @Composable get() = CircleDashedCheckDefinition.asImageVector()
