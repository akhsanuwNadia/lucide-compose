package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Signpost") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(12.0,13.0)
                lineTo(12.0,21.0)
            }
            lucidePath(strokeWidth) {
                moveTo(12.0,3.0)
                lineTo(12.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.3540000915527344,10.354000091552734)
                curveTo(2.127324104309082,10.127601623535156,1.999955415725708,9.820372581481934,1.999955415725708,9.5)
                curveTo(1.999955415725708,9.179627418518066,2.127324104309082,8.872398376464844,2.3540000915527344,8.645999908447266)
                lineTo(4.414000034332275,6.585999965667725)
                curveTo(4.788985729217529,6.210901260375977,5.297610282897949,6.000113487243652,5.828000068664551,6.0)
                lineTo(18.172000885009766,6.0)
                curveTo(18.702390670776367,6.000113487243652,19.211015701293945,6.210901260375977,19.586000442504883,6.585999965667725)
                lineTo(21.645999908447266,8.645999908447266)
                curveTo(21.872676849365234,8.872398376464844,22.000043869018555,9.179627418518066,22.000043869018555,9.5)
                curveTo(22.000043869018555,9.820372581481934,21.872676849365234,10.127601623535156,21.645999908447266,10.354000091552734)
                lineTo(19.586000442504883,12.413999557495117)
                curveTo(19.211015701293945,12.789098739624023,18.702390670776367,12.999886512756348,18.172000885009766,13.0)
                lineTo(5.828000068664551,13.0)
                curveTo(5.297610282897949,12.999886512756348,4.788985252380371,12.789098739624023,4.414000034332275,12.413999557495117)
                close()
            }
}

public val LucideIcons.All.SignpostDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Signpost: ImageVector
    @Composable get() = SignpostDefinition.asImageVector()
