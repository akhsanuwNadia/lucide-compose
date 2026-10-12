package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("BookPlus") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0f,7.0f)
                lineTo(12.0f,13.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0f,19.5f)
                lineTo(4.0f,4.5f)
                curveTo(4.0f,3.1192882f,5.119288f,2.0f,6.5f,2.0f)
                lineTo(19.0f,2.0f)
                curveTo(19.552284f,2.0f,20.0f,2.4477153f,20.0f,3.0f)
                lineTo(20.0f,21.0f)
                curveTo(20.0f,21.552284f,19.552284f,22.0f,19.0f,22.0f)
                lineTo(6.5f,22.0f)
                curveTo(5.1236525f,21.993845f,4.0111556f,20.876362f,4.0111556f,19.5f)
                curveTo(4.0111556f,18.123638f,5.1236525f,17.006155f,6.5f,17.0f)
                lineTo(20.0f,17.0f)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0f,10.0f)
                lineTo(15.0f,10.0f)
            }
}

public val LucideIcons.All.BookPlusDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.BookPlus: ImageVector
    @Composable get() = BookPlusDefinition.asImageVector()
