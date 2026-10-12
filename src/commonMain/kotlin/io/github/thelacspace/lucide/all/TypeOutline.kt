package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("TypeOutline") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14.0,16.5)
                curveTo(14.0,16.776142120361328,14.223857879638672,17.0,14.5,17.0)
                lineTo(15.0,17.0)
                curveTo(16.101078033447266,17.004924774169922,16.99107551574707,17.898910522460938,16.99107551574707,19.0)
                curveTo(16.99107551574707,20.101089477539062,16.101078033447266,20.995075225830078,15.0,21.0)
                lineTo(9.0,21.0)
                curveTo(7.898921966552734,20.995075225830078,7.00892448425293,20.101089477539062,7.00892448425293,19.0)
                curveTo(7.00892448425293,17.898910522460938,7.898921966552734,17.004924774169922,9.0,17.0)
                lineTo(9.5,17.0)
                curveTo(9.776142120361328,17.0,10.0,16.776142120361328,10.0,16.5)
                lineTo(10.0,7.5)
                curveTo(10.0,7.223857402801514,9.776142120361328,7.0,9.5,7.0)
                lineTo(6.5,7.0)
                curveTo(6.223857402801514,7.0,6.0,7.223857402801514,6.0,7.5)
                lineTo(6.0,8.0)
                curveTo(5.995075702667236,9.101078033447266,5.101089000701904,9.99107551574707,4.0,9.99107551574707)
                curveTo(2.8989107608795166,9.99107551574707,2.0049242973327637,9.101078033447266,2.0,8.0)
                lineTo(2.0,5.0)
                curveTo(2.0,3.895430564880371,2.895430564880371,3.0,4.0,3.0)
                lineTo(20.0,3.0)
                curveTo(21.104570388793945,3.0,22.0,3.895430564880371,22.0,5.0)
                lineTo(22.0,8.0)
                curveTo(21.995075225830078,9.101078033447266,21.101089477539062,9.99107551574707,20.0,9.99107551574707)
                curveTo(18.898910522460938,9.99107551574707,18.004924774169922,9.101078033447266,18.0,8.0)
                lineTo(18.0,7.5)
                curveTo(18.0,7.223857402801514,17.776142120361328,7.0,17.5,7.0)
                lineTo(14.5,7.0)
                curveTo(14.223857879638672,7.0,14.0,7.223857402801514,14.0,7.5)
                close()
            }
}

public val LucideIcons.All.TypeOutlineDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.TypeOutline: ImageVector
    @Composable get() = TypeOutlineDefinition.asImageVector()
