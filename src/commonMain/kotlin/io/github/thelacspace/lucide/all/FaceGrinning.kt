package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FaceGrinning") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15.0,10.0)
                lineTo(15.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(7.084000110626221,14.302000045776367)
                curveTo(7.71965217590332,16.488765716552734,9.723221778869629,17.99286460876465,12.000499725341797,17.99286460876465)
                curveTo(14.277777671813965,17.99286460876465,16.281347274780273,16.488765716552734,16.91699981689453,14.302000045776367)
                curveTo(16.936420440673828,14.229402542114258,16.920713424682617,14.151899337768555,16.874563217163086,14.09259033203125)
                curveTo(16.828411102294922,14.033280372619629,16.757143020629883,13.99901294708252,16.68199920654297,14.0)
                lineTo(7.320000171661377,14.0)
                curveTo(7.244856357574463,13.99901294708252,7.173588752746582,14.033280372619629,7.127437114715576,14.09259033203125)
                curveTo(7.0812859535217285,14.151899337768555,7.065579891204834,14.229402542114258,7.085000038146973,14.302000045776367)
            }
            lucidePath(strokeWidth) {
                moveTo(9.0,10.0)
                lineTo(9.0,9.0)
            }
            lucidePath(strokeWidth) {
                moveTo(2.0,12.0)
                curveTo(1.9839749336242676,15.583309173583984,3.8864517211914062,18.901302337646484,6.987045764923096,20.697599411010742)
                curveTo(10.087639808654785,22.493896484375,13.912360191345215,22.493896484375,17.012954711914062,20.697599411010742)
                curveTo(20.113548278808594,18.901302337646484,22.01602554321289,15.583309173583984,22.0,12.0)
                curveTo(22.01602554321289,8.416690826416016,20.113548278808594,5.098697662353516,17.012954711914062,3.302401065826416)
                curveTo(13.912360191345215,1.5061043500900269,10.087639808654785,1.5061043500900269,6.987045764923096,3.302401065826416)
                curveTo(3.8864517211914062,5.098697662353516,1.9839749336242676,8.416690826416016,2.0,12.0)
            }
}

public val LucideIcons.All.FaceGrinningDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FaceGrinning: ImageVector
    @Composable get() = FaceGrinningDefinition.asImageVector()
