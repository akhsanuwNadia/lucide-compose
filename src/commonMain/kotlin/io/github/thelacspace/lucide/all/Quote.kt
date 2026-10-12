package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Quote") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(16.0f,3.0f)
                curveTo(14.895431f,3.0f,14.0f,3.8954306f,14.0f,5.0f)
                lineTo(14.0f,11.0f)
                curveTo(14.0f,12.104569f,14.895431f,13.0f,16.0f,13.0f)
                curveTo(16.552284f,13.0f,17.0f,13.447715f,17.0f,14.0f)
                lineTo(17.0f,15.0f)
                curveTo(17.0f,16.10457f,16.10457f,17.0f,15.0f,17.0f)
                curveTo(14.447715f,17.0f,14.0f,17.447716f,14.0f,18.0f)
                lineTo(14.0f,20.0f)
                curveTo(14.0f,20.552284f,14.447715f,21.0f,15.0f,21.0f)
                curveTo(18.31371f,21.0f,21.0f,18.31371f,21.0f,15.0f)
                lineTo(21.0f,5.0f)
                curveTo(21.0f,3.8954306f,20.10457f,3.0f,19.0f,3.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,3.0f)
                curveTo(3.8954306f,3.0f,3.0f,3.8954306f,3.0f,5.0f)
                lineTo(3.0f,11.0f)
                curveTo(3.0f,12.104569f,3.8954306f,13.0f,5.0f,13.0f)
                curveTo(5.5522847f,13.0f,6.0f,13.447715f,6.0f,14.0f)
                lineTo(6.0f,15.0f)
                curveTo(6.0f,16.10457f,5.1045694f,17.0f,4.0f,17.0f)
                curveTo(3.4477153f,17.0f,3.0f,17.447716f,3.0f,18.0f)
                lineTo(3.0f,20.0f)
                curveTo(3.0f,20.552284f,3.4477153f,21.0f,4.0f,21.0f)
                curveTo(7.3137083f,21.0f,10.0f,18.31371f,10.0f,15.0f)
                lineTo(10.0f,5.0f)
                curveTo(10.0f,3.8954306f,9.104569f,3.0f,8.0f,3.0f)
                close()
            }
}

public val LucideIcons.All.QuoteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Quote: ImageVector
    @Composable get() = QuoteDefinition.asImageVector()
