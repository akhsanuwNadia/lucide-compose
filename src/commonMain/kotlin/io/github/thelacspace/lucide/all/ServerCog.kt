package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("ServerCog") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10.85200023651123,14.772000312805176)
                lineTo(10.468999862670898,15.695000648498535)
            }
            lucidePath(strokeWidth) {
                moveTo(13.14799976348877,14.772000312805176)
                curveTo(14.143133163452148,14.36507797241211,14.844475746154785,13.456806182861328,14.98646068572998,12.391106605529785)
                curveTo(15.128446578979492,11.325407028198242,14.68936824798584,10.2651948928833,13.83548641204834,9.61192512512207)
                curveTo(12.98160457611084,8.95865535736084,11.843453407287598,8.81219482421875,10.851999282836914,9.22800064086914)
                lineTo(10.468998908996582,8.305000305175781)
            }
            lucidePath(strokeWidth) {
                moveTo(13.14799976348877,9.227999687194824)
                lineTo(13.531000137329102,8.304999351501465)
            }
            lucidePath(strokeWidth) {
                moveTo(13.529999732971191,15.696000099182129)
                lineTo(13.14799976348877,14.772000312805176)
                curveTo(12.156545639038086,15.187806129455566,11.018394470214844,15.041345596313477,10.164512634277344,14.388075828552246)
                curveTo(9.310630798339844,13.734806060791016,8.871552467346191,12.674593925476074,9.013538360595703,11.608894348144531)
                curveTo(9.155523300170898,10.543194770812988,9.856865882873535,9.634922981262207,10.851999282836914,9.22800064086914)
            }
            lucidePath(strokeWidth) {
                moveTo(14.772000312805176,10.85200023651123)
                lineTo(15.695000648498535,10.468999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(14.772000312805176,13.14799976348877)
                lineTo(15.695000648498535,13.531000137329102)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5,10.0)
                lineTo(4.0,10.0)
                curveTo(2.895430564880371,10.0,2.0,9.104569435119629,2.0,8.0)
                lineTo(2.0,4.0)
                curveTo(2.0,2.895430564880371,2.895430564880371,2.0,4.0,2.0)
                lineTo(20.0,2.0)
                curveTo(21.104570388793945,2.0,22.0,2.895430564880371,22.0,4.0)
                lineTo(22.0,8.0)
                curveTo(22.0,9.104569435119629,21.104570388793945,10.0,20.0,10.0)
                lineTo(19.5,10.0)
            }
            lucidePath(strokeWidth) {
                moveTo(4.5,14.0)
                lineTo(4.0,14.0)
                curveTo(2.895430564880371,14.0,2.0,14.895430564880371,2.0,16.0)
                lineTo(2.0,20.0)
                curveTo(2.0,21.104570388793945,2.895430564880371,22.0,4.0,22.0)
                lineTo(20.0,22.0)
                curveTo(21.104570388793945,22.0,22.0,21.104570388793945,22.0,20.0)
                lineTo(22.0,16.0)
                curveTo(22.0,14.895430564880371,21.104570388793945,14.0,20.0,14.0)
                lineTo(19.5,14.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,18.0)
                lineTo(6.010000228881836,18.0)
            }
            lucidePath(strokeWidth) {
                moveTo(6.0,6.0)
                lineTo(6.010000228881836,6.0)
            }
            lucidePath(strokeWidth) {
                moveTo(9.227999687194824,10.85200023651123)
                lineTo(8.304999351501465,10.468999862670898)
            }
            lucidePath(strokeWidth) {
                moveTo(9.227999687194824,13.14799976348877)
                lineTo(8.304999351501465,13.531000137329102)
            }
}

public val LucideIcons.All.ServerCogDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.ServerCog: ImageVector
    @Composable get() = ServerCogDefinition.asImageVector()
