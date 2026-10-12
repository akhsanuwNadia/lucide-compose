package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Omega") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(3.0,20.0)
                lineTo(7.5,20.0)
                curveTo(7.776142597198486,20.0,8.0,19.776142120361328,8.0,19.5)
                lineTo(8.0,19.218000411987305)
                curveTo(7.998081684112549,19.039608001708984,7.904845714569092,18.874650955200195,7.752999782562256,18.7810001373291)
                curveTo(4.7296295166015625,16.887540817260742,3.3252696990966797,13.221084594726562,4.310092926025391,9.792370796203613)
                curveTo(5.294915676116943,6.363656997680664,8.430915832519531,4.001319408416748,11.998260498046875,4.000899314880371)
                curveTo(15.565606117248535,4.000479698181152,18.70216178894043,6.362079620361328,19.68779182434082,9.79056167602539)
                curveTo(20.67342185974121,13.219042778015137,19.26992416381836,16.88582992553711,16.246999740600586,18.780000686645508)
                curveTo(16.09485626220703,18.87384033203125,16.001575469970703,19.03925132751465,16.0,19.218000411987305)
                lineTo(16.0,19.5)
                curveTo(16.0,19.776142120361328,16.223857879638672,20.0,16.5,20.0)
                lineTo(21.0,20.0)
            }
}

public val LucideIcons.All.OmegaDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Omega: ImageVector
    @Composable get() = OmegaDefinition.asImageVector()
