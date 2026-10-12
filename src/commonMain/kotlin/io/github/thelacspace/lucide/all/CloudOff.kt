package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("CloudOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.9399995803833,5.27400016784668)
                curveTo(13.23111343383789,5.9341511726379395,15.028645515441895,7.715101718902588,15.710000038146973,10.0)
                lineTo(17.5,10.0)
                curveTo(18.97154998779297,10.000018119812012,20.350122451782227,10.719532012939453,21.191606521606445,11.926746368408203)
                curveTo(22.03308868408203,13.133960723876953,22.231155395507812,14.676340103149414,21.722000122070312,16.05699920654297)
            }
            lucidePath(strokeWidth) {
                moveTo(18.79599952697754,18.809999465942383)
                curveTo(18.375577926635742,18.936203002929688,17.938955307006836,19.000215530395508,17.5,19.0)
                lineTo(9.0,19.0)
                curveTo(5.77067232131958,18.999460220336914,2.9608094692230225,16.789846420288086,2.198824882507324,13.651703834533691)
                curveTo(1.4368401765823364,10.513561248779297,2.9205117225646973,7.261416435241699,5.789999961853027,5.78000020980835)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,2.0)
                lineTo(22.0,22.0)
            }
}

public val LucideIcons.All.CloudOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.CloudOff: ImageVector
    @Composable get() = CloudOffDefinition.asImageVector()
