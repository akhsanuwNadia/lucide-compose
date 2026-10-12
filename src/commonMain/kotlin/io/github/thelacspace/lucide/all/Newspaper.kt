package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Newspaper") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,18.0)
                lineTo(10.0,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(18.0,14.0)
                lineTo(10.0,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.0,22.0)
                lineTo(20.0,22.0)
                curveTo(21.104570388793945,22.0,22.0,21.104570388793945,22.0,20.0)
                lineTo(22.0,4.0)
                curveTo(22.0,2.895430564880371,21.104570388793945,2.0,20.0,2.0)
                lineTo(8.0,2.0)
                curveTo(6.895430564880371,2.0,6.0,2.895430564880371,6.0,4.0)
                lineTo(6.0,20.0)
                curveTo(5.995075702667236,21.101078033447266,5.101089000701904,21.99107551574707,4.0,21.99107551574707)
                curveTo(2.8989107608795166,21.99107551574707,2.0049242973327637,21.101078033447266,2.0,20.0)
                lineTo(2.0,11.0)
                curveTo(2.0,9.895430564880371,2.895430564880371,9.0,4.0,9.0)
                lineTo(6.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(11.0,6.0)
                lineTo(17.0,6.0)
                lineTo(18.0,6.0)
                lineTo(18.0,10.0)
                lineTo(17.0,10.0)
                lineTo(11.0,10.0)
                lineTo(10.0,10.0)
                lineTo(10.0,6.0)
                lineTo(11.0,6.0)
                close()
            }
}

public val LucideIcons.All.NewspaperDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Newspaper: ImageVector
    @Composable get() = NewspaperDefinition.asImageVector()
