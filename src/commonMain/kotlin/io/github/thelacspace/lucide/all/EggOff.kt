package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EggOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,14.347000122070312)
                lineTo(20.0,14.0)
                curveTo(20.0,8.0,16.0,2.0,12.0,2.0)
                curveTo(10.92199993133545,2.0,9.843000411987305,2.435999870300293,8.843000411987305,3.190000057220459)
            }
            lucidePath(strokeWidth) {
                moveTo(6.205999851226807,6.210000038146973)
                curveTo(4.870999813079834,8.399999618530273,4.0,11.199999809265137,4.0,14.0)
                curveTo(3.9997479915618896,17.496431350708008,6.270140647888184,20.587968826293945,9.606401443481445,21.63409996032715)
                curveTo(12.942662239074707,22.68023109436035,16.57179069519043,21.438570022583008,18.56800079345703,18.56800079345703)
            }
}

public val LucideIcons.All.EggOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EggOff: ImageVector
    @Composable get() = EggOffDefinition.asImageVector()
