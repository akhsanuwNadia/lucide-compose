package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("MailOpen") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(21.200000762939453,8.399999618530273)
                curveTo(21.700000762939453,8.779999732971191,22.0,9.369999885559082,22.0,10.0)
                lineTo(22.0,20.0)
                curveTo(22.0,21.104570388793945,21.104570388793945,22.0,20.0,22.0)
                lineTo(4.0,22.0)
                curveTo(2.895430564880371,22.0,2.0,21.104570388793945,2.0,20.0)
                lineTo(2.0,10.0)
                curveTo(1.9999998807907104,9.370485305786133,2.2963881492614746,8.777708053588867,2.799999952316284,8.399999618530273)
                lineTo(10.800000190734863,2.3999996185302734)
                curveTo(11.51111125946045,1.8666659593582153,12.488889694213867,1.8666659593582153,13.200000762939453,2.3999996185302734)
                lineTo(21.200000762939453,8.399999618530273)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(22.0,10.0)
                lineTo(13.029999732971191,15.699999809265137)
                curveTo(12.400046348571777,16.094680786132812,11.599952697753906,16.094680786132812,10.969999313354492,15.699999809265137)
                lineTo(2.0,10.0)
            }
}

public val LucideIcons.All.MailOpenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.MailOpen: ImageVector
    @Composable get() = MailOpenDefinition.asImageVector()
