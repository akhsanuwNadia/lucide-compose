package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceSlightlySmilingPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(13.267f, 2.08f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 10f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 5f)
                horizontalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.472f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(19f, 2f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 10f)
                verticalLineTo(9f)
            }
}

public val LucideIcons.All.FaceSlightlySmilingPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceSlightlySmilingPlus: ImageVector
    @Composable get() = FaceSlightlySmilingPlusDefinition.asImageVector()
