package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TextWrap") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0,16.0)
                lineTo(13.0,19.0)
                lineTo(16.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,12.0)
                lineTo(17.5,12.0)
                curveTo(19.42688751220703,12.008617401123047,20.98438262939453,13.573094367980957,20.98438262939453,15.5)
                curveTo(20.98438262939453,17.42690658569336,19.42688751220703,18.991382598876953,17.5,19.0)
                lineTo(13.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,19.0)
                lineTo(9.0,19.0)
            }
            lucidePath(strokeWidth) {
                moveTo(3.0,5.0)
                lineTo(21.0,5.0)
            }
}

public val LucideIcons.All.TextWrapDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TextWrap: ImageVector
    @Composable get() = TextWrapDefinition.asImageVector()
