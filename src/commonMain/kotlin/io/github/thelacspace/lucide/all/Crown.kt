package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Crown") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11.562f,3.266f)
                curveTo(11.649909f,3.1063354f,11.817735f,3.0071552f,12.0f,3.0071552f)
                curveTo(12.182266f,3.0071552f,12.350092f,3.1063354f,12.438001f,3.266f)
                lineTo(15.39f,8.87f)
                curveTo(15.532541f,9.132746f,15.785148f,9.317948f,16.0786f,9.374859f)
                curveTo(16.372053f,9.431768f,16.675577f,9.354417f,16.906f,9.164f)
                lineTo(21.183f,5.5f)
                curveTo(21.351452f,5.3629904f,21.589077f,5.350362f,21.771101f,5.4687457f)
                curveTo(21.953125f,5.58713f,22.037935f,5.8094625f,21.981f,6.019f)
                lineTo(19.147001f,16.265f)
                curveTo(19.028143f,16.695795f,18.637878f,16.995432f,18.191002f,16.998999f)
                lineTo(5.81f,16.998999f)
                curveTo(5.3627505f,16.995876f,4.9719605f,16.69615f,4.8529997f,16.265f)
                lineTo(2.02f,6.02f)
                curveTo(1.9630656f,5.8104625f,2.0478768f,5.5881305f,2.2299006f,5.4697466f)
                curveTo(2.4119244f,5.351362f,2.6495485f,5.363991f,2.8179998f,5.501f)
                lineTo(7.094f,9.165f)
                curveTo(7.324423f,9.355417f,7.627947f,9.432769f,7.9213996f,9.375859f)
                curveTo(8.214852f,9.318949f,8.467459f,9.133746f,8.61f,8.871f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(5.0f,21.0f)
                lineTo(19.0f,21.0f)
            }
}

public val LucideIcons.All.CrownDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Crown: ImageVector
    @Composable get() = CrownDefinition.asImageVector()
