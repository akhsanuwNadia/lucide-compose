package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("GlobeLock") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.685999870300293,15.0)
                curveTo(15.12992000579834,17.629886627197266,13.853751182556152,20.053430557250977,12.0,22.0)
                curveTo(6.666666507720947,16.399999618530273,6.666666507720947,7.599999904632568,12.0,2.0)
                curveTo(6.8700737953186035,2.001337766647339,2.5731983184814453,5.884251117706299,2.0539638996124268,10.987832069396973)
                curveTo(1.5347294807434082,16.091413497924805,4.961568355560303,20.7601318359375,9.986114501953125,21.79457664489746)
                curveTo(15.010661125183105,22.829023361206055,20.003021240234375,19.893638610839844,21.54199981689453,15.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                lineTo(10.5,12.0)
            }
            lucidePath(strokeWidth) {
                moveTo(20.0,6.0)
                lineTo(20.0,4.0)
                curveTo(20.003204345703125,3.2833380699157715,19.622709274291992,2.619739532470703,19.00259017944336,2.2604801654815674)
                curveTo(18.38247299194336,1.9012209177017212,17.61752700805664,1.9012209177017212,16.99740982055664,2.2604801654815674)
                curveTo(16.377290725708008,2.619739532470703,15.996794700622559,3.2833380699157715,16.0,4.0)
                lineTo(16.0,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(15.0,6.0)
                lineTo(21.0,6.0)
                lineTo(22.0,6.0)
                lineTo(22.0,11.0)
                lineTo(21.0,11.0)
                lineTo(15.0,11.0)
                lineTo(14.0,11.0)
                lineTo(14.0,6.0)
                lineTo(15.0,6.0)
                close()
            }
}

public val LucideIcons.All.GlobeLockDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.GlobeLock: ImageVector
    @Composable get() = GlobeLockDefinition.asImageVector()
